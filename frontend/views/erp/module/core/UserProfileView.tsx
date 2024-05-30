import { Tab } from '@headlessui/react';
import { FormLayout } from '@hilla/react-components/FormLayout';
import { TextField } from '@hilla/react-components/TextField';
import { useForm } from '@hilla/react-form';
import Chart from 'react-apexcharts';
// import { ResponsiveCalendar } from '@nivo/calendar';
import RippleDivRC from 'Frontend/components/effects/ripple/div/RippleDivRC';
import { AutoGridRef } from 'Frontend/components/grid/autogrid';
import DialogFromRC from 'Frontend/components/ho_master/from/DialogFromRC';
import RoleDto from 'Frontend/generated/com/itbd/application/db/dto/RoleDto';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';
import ModuleDefDto from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleDefDto';
import UserDto from 'Frontend/generated/com/itbd/application/db/dto/users/UserDto';
import UserDtoModel from 'Frontend/generated/com/itbd/application/db/dto/users/UserDtoModel';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
import { Tooltip as ReactTooltip } from 'react-tooltip';

// Optionally import the CSS
import {
  BlockModuleDtoCrudService,
  DocFieldDtoCrudService,
  HasRoleDtoCrudService,
  ModuleDefDtoCrudService,
  RoleDtoCrudService,
  UserDtoCrudService,
} from 'Frontend/generated/endpoints';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction';
import React, { useEffect, useState } from 'react';
import CalendarHeatmap from 'react-calendar-heatmap';
// import 'react-calendar-heatmap/dist/styles.css';
import 'themes/protisthan/components/calendar-heatmap.css';

import { useNavigate, useParams } from 'react-router-dom';

const responsiveSteps = [
  { minWidth: '0', columns: 1 },
  { minWidth: '500px', columns: 2 },
];
function classNames(...classes: string[]) {
  return classes.filter(Boolean).join(' ');
}

function TabHeader({ title }: { title: string }) {
  return (
    <RippleDivRC className="w-full rounded-lg">
      <Tab
        className={({ selected }) =>
          classNames(
            'w-full rounded-lg py-2.5 text-sm font-semibold leading-5',
            'ring-white/60 ring-offset-2 ring-offset-indigo-400 focus:outline-none focus:ring-2',
            selected
              ? 'bg-white text-indigo-700 shadow'
              : 'text-indigo-100 hover:bg-white/[0.12] hover:text-white'
          )
        }
      >
        {title}
      </Tab>
    </RippleDivRC>
  );
}

function TabPaneE({ children }: { children?: React.ReactNode }) {
  return (
    <Tab.Panel
      className={classNames(
        'rounded-xl bg-white p-3',
        'ring-white/60 ring-offset-2 ring-offset-blue-400 focus:outline-none focus:ring-2'
      )}
    >
      {children}
    </Tab.Panel>
  );
}

const pagination: Pageable = {
  pageNumber: 0,
  pageSize: 1000,
  sort: {
    orders: [{ property: 'idx', direction: Direction.ASC, ignoreCase: false }],
  },
};
function filterGenerator(type: string, property: string, filter: string | undefined) {
  const filters: Filter = {
    '@type': type,
    children: [
      {
        '@type': 'propertyString',
        propertyId: property,
        filterValue: filter,
        matcher: Matcher.EQUALS,
      },
    ],
  };
  return filters;
}

function UserProfileView() {
  const { queryId } = useParams();
  const navigate = useNavigate();
  const [uiField, setUiField] = useState<DocFieldDto[]>([]);
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [failureNotification, setFailureNotification] = useState<boolean>(false);

  const [isOpen, setIsOpen] = useState(false);
  const [isReportOpen, setIsReportOpen] = useState(false);

  //
  const [roles, setRoles] = useState<RoleDto[]>([]);
  const [selectedRoleIds, setSelectedRoleIds] = useState<string[]>([]);
  //
  const [modules, setModules] = useState<ModuleDefDto[]>([]);
  const [selectedModuleIds, setSelectedModuleIds] = useState<string[]>([]);

  const autoGridRef = React.useRef<AutoGridRef>(null);
  const [user, setUser] = useState<UserDto>({} as UserDto);
  const [selectedUserItems, setSelectedUserItems] = useState<UserDto[]>([]);
  const [selectedUserIds, setSelectedUserIds] = useState<string[]>([]);
  const [gridRefresh, setGridRefresh] = useState<boolean>(false);
  const {
    model,
    field,
    value,
    read,
    submit,
    clear,
    reset,
    visited,
    dirty,
    invalid,
    submitting,
    validate,
    addValidator,
  } = useForm(UserDtoModel, {
    onSubmit: async (userE) => {
      await UserDtoCrudService.save(userE)
        .then((result) => {
          clear();
          setSuccessNotification(true);
          setIsOpen(false);
          setGridRefresh(!gridRefresh);
        })
        .catch((error) => {
          setFailureNotification(true);
        });
    },
  });

  useEffect(() => {
    autoGridRef.current?.refresh();
  }, [gridRefresh]);
  useEffect(() => {
    DocFieldDtoCrudService.list(pagination, filterGenerator('and', 'parent', 'User')).then(
      (result) => {
        setUiField(result);
      }
    );
  }, []);

  useEffect(() => {
    UserDtoCrudService.list(pagination, filterGenerator('and', 'name', 'ridoykj@gmail.com')).then(
      (result) => {
        setUser(result[0]);
      }
    );
  }, []);

  useEffect(() => {
    if (queryId !== undefined)
      HasRoleDtoCrudService.list(pagination, filterGenerator('and', 'parent', queryId)).then(
        (result) => {
          const roleIds: string[] = result
            .map((role) => role.role)
            .filter((it) => it !== undefined) as string[];
          setSelectedRoleIds(roleIds);
        }
      );
    RoleDtoCrudService.list(pagination, undefined).then((result) => {
      setRoles(result);
    });
  }, [queryId]);

  useEffect(() => {
    let blockModule: string[] = [];
    if (queryId !== undefined)
      BlockModuleDtoCrudService.list(pagination, filterGenerator('and', 'parent', queryId)).then(
        (result) => {
          blockModule = result
            .map((role) => role.name)
            .filter((it) => it !== undefined) as string[];
        }
      );
    ModuleDefDtoCrudService.list(pagination, undefined).then((result) => {
      setModules(result);
      const modulesIds: string[] = result
        .map((role) => role.name)
        .filter((it) => it !== undefined && !blockModule.includes(it)) as string[];
      setSelectedModuleIds(modulesIds);
    });
  }, [queryId]);

  // ProfileHeader Component
  function ProfileHeader({
    coverPhoto,
    profilePhoto,
  }: {
    coverPhoto: string;
    profilePhoto: string;
  }) {
    return (
      <div className="profile-header bg-white border-white rounded-lg shadow-md pb-4">
        <img src={coverPhoto} alt="Cover" className="w-full h-36 md:h-44 object-cover" />
        <img
          src={profilePhoto}
          alt="Profile"
          className="w-24 h-24 object-cover rounded-full border-4 border-white -mt-12 ml-5 shadow-md"
        />
        <div>
          <h1 className="text-2xl font-bold ml-5 mt-3">{user.fullName}</h1>
          <p className="text-sm ml-5">Sr. Software Developer (Java FullStack)</p>
          <p className="text-sm text-gray-400 ml-5">Saver, Dhaka, Bangladesh</p>
        </div>
      </div>
    );
  }

  function FillData({ label, data }: { label: string; data?: any }) {
    return (
      <p>
        <strong>{label}</strong> {data}
      </p>
    );
  }

  // ProfileInfo Component
  function ProfileInfo({ userE }: { userE: UserDto }) {
    return (
      <>
        <div>
          <FillData label="UserID:" data={userE.name} />
          <FillData label="Username:" data={userE.username} />
          <FillData label="Full Name:" data={userE.fullName} />
          <FillData label="First Name:" data={userE.firstName} />
          <FillData label="Middle Name:" data={userE.middleName} />
          <FillData label="Last Name:" data={userE.lastName} />
          <FillData label="Birth Date:" data={userE.birthDate} />
          <FillData label="Gender:" data={userE.gender} />
          <FillData label="Creation:" data={userE.creation} />
          <FillData label="Language:" data={userE.language} />
          <FillData label="Bio:" data={userE.bio} />
          <FillData label="Assign:" data={userE.assign} />
          <FillData label="Comments:" data={userE.comments} />
          <FillData label="Liked By:" data={userE.likedBy} />
          <FillData label="User Tags:" data={userE.userTags} />
        </div>
        <div>
          <FillData label="Desk Theme:" data={userE.deskTheme} />
          <FillData label="Follow Assigned Documents:" data={userE.followAssignedDocuments} />
          <FillData label="Interest:" data={userE.interest} />
          <FillData label="Last Active:" data={userE.lastActive} />
          <FillData label="Last IP:" data={userE.lastIp} />
          <FillData label="Last Login:" data={userE.lastLogin} />
          <FillData label="Last Password Reset Date:" data={userE.lastPasswordResetDate} />
          <FillData label="Location:" data={userE.location} />
          <FillData label="Login After:" data={userE.loginAfter} />
          <FillData label="Login Before:" data={userE.loginBefore} />
          <FillData label="Onboarding Status:" data={userE.onboardingStatus} />
          <FillData label="Owner:" data={userE.owner} />
          <FillData label="User Type:" data={userE.userType} />
        </div>
      </>
    );
  }

  // ContactInfo Component
  function ContactInfo({ userE }: { userE: UserDto }) {
    return (
      <div>
        <FillData label="Assign:" data={userE.assign} />
        <FillData label="Comments:" data={userE.comments} />
        <FillData label="Liked By:" data={userE.likedBy} />
        <FillData label="User Tags:" data={userE.userTags} />
        <FillData label="Allowed in Mentions:" data={userE.allowedInMentions} />
        <FillData label="API Key:" data={userE.apiKey} />
        <FillData label="API Secret:" data={userE.apiSecret} />
        <FillData label="Banner Image:" data={userE.bannerImage} />
        <FillData label="Bio:" data={userE.bio} />
        <FillData label="Birth Date:" data={userE.birthDate} />
        <FillData
          label="Bypass Restrict IP Check if 2FA Enabled:"
          data={userE.bypassRestrictIpCheckIf2faEnabled}
        />
        <FillData label="Creation:" data={userE.creation} />
        <FillData label="Desk Theme:" data={userE.deskTheme} />
        <FillData label="Docstatus:" data={userE.isDocStatus} />
        <FillData label="Document Follow Frequency:" data={userE.documentFollowFrequency} />
        <FillData label="Document Follow Notify:" data={userE.documentFollowNotify} />
        <FillData label="Email:" data={userE.email} />
        <FillData label="Email Signature:" data={userE.emailSignature} />
        <FillData label="Enabled:" data={userE.enabled} />
        <FillData label="Follow Assigned Documents:" data={userE.followAssignedDocuments} />
        <FillData label="Follow Commented Documents:" data={userE.followCommentedDocuments} />
        <FillData label="Follow Created Documents:" data={userE.followCreatedDocuments} />
        <FillData label="Follow Liked Documents:" data={userE.followLikedDocuments} />
        <FillData label="Follow Shared Documents:" data={userE.followSharedDocuments} />
        <FillData label="Home Settings:" data={userE.homeSettings} />
        <FillData label="Idx:" data={userE.idx} />
        <FillData label="Interest:" data={userE.interest} />
        <FillData label="Language:" data={userE.language} />
        <FillData label="Last Active:" data={userE.lastActive} />
        <FillData label="Last IP:" data={userE.lastIp} />
        <FillData label="Last Known Versions:" data={userE.lastKnownVersions} />
        <FillData label="Last Login:" data={userE.lastLogin} />
        <FillData label="Last Name:" data={userE.lastName} />
        <FillData label="Last Password Reset Date:" data={userE.lastPasswordResetDate} />
        <FillData
          label="Last Reset Password Key Generated On:"
          data={userE.lastResetPasswordKeyGeneratedOn}
        />
        <FillData label="Location:" data={userE.location} />
        <FillData label="Login After:" data={userE.loginAfter} />
        <FillData label="Login Before:" data={userE.loginBefore} />
        <FillData label="Logout All Sessions:" data={userE.logoutAllSessions} />
        <FillData label="Mobile No:" data={userE.mobileNo} />
        <FillData label="Modified:" data={userE.modified} />
        <FillData label="Modified By:" data={userE.modifiedBy} />
        <FillData label="Module Profile:" data={userE.moduleProfile} />
        <FillData label="Mute Sounds:" data={userE.muteSounds} />
        <FillData label="New Password:" data={userE.newPassword} />
        <FillData label="Onboarding Status:" data={userE.onboardingStatus} />
        <FillData label="Owner:" data={userE.owner} />
        <FillData label="Phone:" data={userE.phone} />
        <FillData label="Redirect URL:" data={userE.redirectUrl} />
        <FillData label="Reset Password Key:" data={userE.resetPasswordKey} />
        <FillData label="Restrict IP:" data={userE.restrictIp} />
        <FillData label="Role Profile Name:" data={userE.roleProfileName} />
        <FillData label="Send Me a Copy:" data={userE.sendMeACopy} />
        <FillData label="Send Welcome Email:" data={userE.sendWelcomeEmail} />
        <FillData label="Simultaneous Sessions:" data={userE.simultaneousSessions} />
        <FillData label="Thread Notify:" data={userE.threadNotify} />
        <FillData label="Time Zone:" data={userE.timeZone} />
        <FillData label="Unsubscribed:" data={userE.enabled} />
        <FillData label="User Image:" data={userE.enabled} />
        <FillData label="User Type:" data={userE.enabled} />
        <FillData label="Username:" data={userE.enabled} />
      </div>
    );
  }
  const graphData = {
    series: [
      {
        name: 'Sell',
        data: [31, 40, 28, 51, 42, 109, 100],
      },
      {
        name: 'Return',
        data: [11, 32, 45, 32, 34, 52, 41],
      },
    ],
  };

  const fieldContent = ['Info', 'Personal', 'Contact', 'Education', 'Experience', 'Skills'];
  return (
    <>
      {/* <div className="container mx-auto px-4 py-8"> */}
      <div className="container mx-auto py-8 md:max-w-5xl">
        <ProfileHeader
          coverPhoto="images/profile/banner.png"
          profilePhoto="images/profile/profile.jpg"
        />
        <div className="mt-8 border rounded-xl">
          <Tab.Group>
            <Tab.List
              className={`flex space-x-1 rounded-xl bg-indigo-700 p-1 ${fieldContent.length <= 1 ? 'hidden' : ''}`}
            >
              {fieldContent.map((lable, index) => (
                <TabHeader key={lable.length > 0 ? lable.length : `tabH-${index}`} title={lable} />
              ))}
            </Tab.List>
            <Tab.Panels className="mt-2">
              <TabPaneE>
                <div className="w-full">
                  <h1 className="text-2xl font-bold py-2">Attendance</h1>
                  <CalendarHeatmap
                    startDate={new Date('2024-01-01')}
                    endDate={new Date('2024-12-30')}
                    showWeekdayLabels
                    values={[
                      { date: '2024-01-02', count: true },
                      { date: '2024-01-22', count: false },
                      { date: '2024-02-30', count: true },
                      { date: '2024-03-01', count: true },
                      { date: '2024-03-02', count: true },
                      { date: '2024-03-03', count: true },
                      { date: '2024-03-04', count: true },
                    ]}
                    tooltipDataAttrs={({ count, date }: { count: number; date: string }) => {
                      return {
                        'data-tooltip-id': 'cal-tooltip',
                        'data-tooltip-content':
                          count !== null ? `${count ? 'Attend' : 'Absent'} on ${date}` : null,
                      };
                    }}
                  />
                  <ReactTooltip id="cal-tooltip" place="top" />
                </div>
                <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                  <div className="border rounded-xl p-2">
                    <Chart
                      options={{
                        chart: {
                          height: 350,
                          type: 'area',
                        },
                        title: {
                          text: 'Sell vs Return',
                        },
                        dataLabels: {
                          enabled: false,
                        },
                        stroke: {
                          curve: 'smooth',
                        },
                        xaxis: {
                          type: 'datetime',
                          categories: [
                            '2018-09-19T00:00:00.000Z',
                            '2018-09-19T01:30:00.000Z',
                            '2018-09-19T02:30:00.000Z',
                            '2018-09-19T03:30:00.000Z',
                            '2018-09-19T04:30:00.000Z',
                            '2018-09-19T05:30:00.000Z',
                            '2018-09-19T06:30:00.000Z',
                          ],
                        },
                        tooltip: {
                          x: {
                            format: 'dd/MM/yy HH:mm',
                          },
                        },
                      }}
                      series={graphData.series}
                      type="area"
                      height={350}
                    />
                  </div>
                  <div className="border rounded-xl">
                    <Chart
                      options={{
                        chart: {
                          id: 'basic-bar',
                        },
                        title: {
                          text: 'Monthly Attendance Report',
                        },
                        xaxis: {
                          categories: [
                            'Public Holiday',
                            'Weekend',
                            'Present',
                            'Absent',
                            'Leave',
                            'Late',
                          ],
                        },
                        plotOptions: {
                          bar: {
                            borderRadius: 4,
                            horizontal: true,
                          },
                        },
                        dataLabels: {
                          enabled: true,
                        },
                      }}
                      series={[
                        {
                          name: 'Place',
                          data: [1, 8, 14, 1, 3, 3],
                        },
                      ]}
                      type="bar"
                      height={300}
                    />
                  </div>
                </div>
              </TabPaneE>
              <TabPaneE>
                <div className="grid grid-cols-1 md:grid-cols-2 mt-4 gap-4">
                  <ProfileInfo userE={user} />
                </div>
              </TabPaneE>
              <TabPaneE>
                <div className="grid grid-cols-1 md:grid-cols-2 mt-4 gap-4">
                  <ContactInfo userE={user} />
                </div>
              </TabPaneE>
            </Tab.Panels>
          </Tab.Group>
        </div>
      </div>
      <DialogFromRC
        header="Add User"
        opened={isOpen}
        submitDisabled={!dirty || invalid || submitting}
        submit={submit}
        update={value.name != null}
        onOpenedChanged={(event) => {
          setIsOpen(event);
          clear();
        }}
        onNavigate={() => {
          setIsOpen(false);
          clear();
          navigate(`/m/user/_`);
        }}
      >
        <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit p-2">
          <TextField label="Email" {...{ colspan: 1 }} {...field(model.email)} />
          <TextField label="First Name" {...{ colspan: 1 }} {...field(model.firstName)} />
          <TextField label="Role Profile" {...{ colspan: 1 }} {...field(model.roleProfileName)} />
        </FormLayout>
      </DialogFromRC>
    </>
  );
}

export default UserProfileView;
