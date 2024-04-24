// import { Tab } from '@headlessui/react';
// import { Avatar } from '@hilla/react-components/Avatar';
// import { Checkbox } from '@hilla/react-components/Checkbox';
// import { ComboBox } from '@hilla/react-components/ComboBox.js';
// import { DatePicker } from '@hilla/react-components/DatePicker.js';
// import { FormLayout } from '@hilla/react-components/FormLayout';
// import { TextArea } from '@hilla/react-components/TextArea.js';
// import { TextField } from '@hilla/react-components/TextField';
// import { useForm } from '@hilla/react-form';
// import AccordionRC from 'Frontend/components/accordion/AccordionRC';
// import CheckboxList from 'Frontend/components/checkbox/CheckboxListRC';
// import RoleDto from 'Frontend/generated/com/itbd/application/db/dto/RoleDto';
// import ModuleDefDto from 'Frontend/generated/com/itbd/application/db/dto/modules/ModuleDefDto';
// import UserDto from 'Frontend/generated/com/itbd/application/db/dto/users/UserDto';
// import UserDtoModel from 'Frontend/generated/com/itbd/application/db/dto/users/UserDtoModel';
// import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
// import Matcher from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter/Matcher';
// import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';
// import {
//   BlockModuleDtoCrudService,
//   HasRoleDtoCrudService,
//   ModuleDefDtoCrudService,
//   RoleDtoCrudService,
//   UserDtoCrudService,
// } from 'Frontend/generated/endpoints';
// import { useEffect, useState } from 'react';
// import { useParams } from 'react-router-dom';

// const responsiveSteps = [
//   { minWidth: '0', columns: 1 },
//   { minWidth: '300px', columns: 2 },
//   { minWidth: '500px', columns: 3 },
// ];

// const pagination: Pageable = {
//   pageNumber: 0,
//   pageSize: 50,
//   sort: {
//     orders: [],
//   },
// };
// function filterGenerator(filter: string | undefined, type: string) {
//   const filters: Filter = {
//     '@type': type,
//     children: [
//       {
//         '@type': 'propertyString',
//         propertyId: 'parent',
//         filterValue: filter,
//         matcher: Matcher.EQUALS,
//       },
//     ],
//   };
//   return filters;
// }
// function classNames(...classes: string[]) {
//   return classes.filter(Boolean).join(' ');
// }

// function TabHeader({ title }: { title: string }) {
//   return (
//     <Tab
//       className={({ selected }) =>
//         classNames(
//           'w-full rounded-lg py-2.5 text-sm font-semibold leading-5',
//           'ring-white/60 ring-offset-2 ring-offset-blue-400 focus:outline-none focus:ring-2',
//           selected
//             ? 'bg-white text-blue-700 shadow'
//             : 'text-blue-100 hover:bg-white/[0.12] hover:text-white'
//         )
//       }
//     >
//       {title}
//     </Tab>
//   );
// }

// function TabPaneE({ children }: { children?: React.ReactNode }) {
//   return (
//     <Tab.Panel
//       className={classNames(
//         'rounded-xl bg-white p-3',
//         'ring-white/60 ring-offset-2 ring-offset-blue-400 focus:outline-none focus:ring-2'
//       )}
//     >
//       {children}
//     </Tab.Panel>
//   );
// }

// function UserView() {
//   const [successNotification, setSuccessNotification] = useState<boolean>(false);
//   const [failureNotification, setFailureNotification] = useState<boolean>(false);
//   //
//   const [isOpen, setIsOpen] = useState(false);
//   const [isReportOpen, setIsReportOpen] = useState(false);
//   const { userId } = useParams();
//   //
//   const [selectedUserItems, setSelectedUserItems] = useState<UserDto[]>([]);
//   //
//   const [roles, setRoles] = useState<RoleDto[]>([]);
//   const [selectedRoleIds, setSelectedRoleIds] = useState<string[]>([]);
//   //
//   const [modules, setModules] = useState<ModuleDefDto[]>([]);
//   const [selectedModuleIds, setSelectedModuleIds] = useState<string[]>([]);

//   const {
//     model,
//     field,
//     value,
//     read,
//     submit,
//     clear,
//     reset,
//     visited,
//     dirty,
//     invalid,
//     submitting,
//     validate,
//     addValidator,
//   } = useForm(UserDtoModel, {
//     onSubmit: async (user) => {
//       await UserDtoCrudService.save(user)
//         .then((result) => {
//           clear();
//           setSuccessNotification(true);
//           setIsOpen(false);
//         })
//         .catch((error) => {
//           setFailureNotification(true);
//         });
//     },
//   });

//   useEffect(() => {
//     HasRoleDtoCrudService.list(pagination, filterGenerator(userId, 'and')).then((result) => {
//       const roleIds: string[] = result
//         .map((role) => role.role)
//         .filter((it) => it !== undefined) as string[];
//       setSelectedRoleIds(roleIds);
//     });
//     RoleDtoCrudService.list(pagination, undefined).then((result) => {
//       setRoles(result);
//     });
//   }, [userId]);

//   useEffect(() => {
//     let blockModule: string[] = [];
//     BlockModuleDtoCrudService.list(pagination, filterGenerator(userId, 'and')).then((result) => {
//       blockModule = result.map((role) => role.name).filter((it) => it !== undefined) as string[];
//     });
//     ModuleDefDtoCrudService.list(pagination, undefined).then((result) => {
//       setModules(result);
//       const modulesIds: string[] = result
//         .map((role) => role.name)
//         .filter((it) => it !== undefined && !blockModule.includes(it)) as string[];
//       setSelectedModuleIds(modulesIds);
//     });
//   }, [userId]);

//   function UserDetails() {
//     return (
//       <div className="flex flex-col divide-y">
//         <div className="p-1">
//           <Checkbox label="Enable" {...field(model.enabled)} />
//         </div>
//         <div className="p-1">
//           <span className="font-bold">Basic Info</span>
//           <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit">
//             <TextField label="Email" readonly {...{ colspan: 1 }} {...field(model.email)} />

//             <TextField label="First Name" {...{ colspan: 1 }} {...field(model.firstName)} />
//             <TextField label="Middle Name" {...{ colspan: 1 }} {...field(model.middleName)} />
//             <TextField label="Last Name" {...{ colspan: 1 }} {...field(model.lastName)} />

//             <TextField label="Full Name" readonly {...{ colspan: 1 }} {...field(model.fullName)} />
//             <TextField label="Username" {...{ colspan: 1 }} {...field(model.username)} />

//             <TextField label="Language" {...{ colspan: 1 }} {...field(model.language)} />
//             <TextField label="Time Zone" {...{ colspan: 1 }} {...field(model.timeZone)} />
//           </FormLayout>
//         </div>
//       </div>
//     );
//   }

//   function RolePermission() {
//     return (
//       <div className="flex flex-col w-full space-y-2 divide-y">
//         <div>
//           <span className="font-bold">Roles</span>
//           <div className="flex flex-col space-y-2">
//             <ComboBox label="Role Profile" className="md:w-1/2 sm:w-full" />
//             <div className="inline-flex space-x-2">
//               <button
//                 type="button"
//                 className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
//               >
//                 Sellect All
//               </button>
//               <button
//                 type="button"
//                 className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
//               >
//                 Unsellect All
//               </button>
//             </div>
//           </div>
//           <CheckboxList
//             items={roles.map((it) => it.name).filter((it) => it !== undefined) as string[]}
//             value={selectedRoleIds}
//             className="w-full p-2"
//             onValueChange={(values) => {
//               console.info('newCheckedItems', values);
//               setSelectedRoleIds(values);
//             }}
//           />
//         </div>
//         <div>
//           <span className="font-bold">Allow Module</span>
//           <div className="flex flex-col space-y-2">
//             <ComboBox label="Module Profile" className="md:w-1/2 sm:w-full" />
//             <div className="inline-flex space-x-2">
//               <button
//                 type="button"
//                 className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
//               >
//                 Sellect All
//               </button>
//               <button
//                 type="button"
//                 className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
//               >
//                 Unsellect All
//               </button>
//             </div>
//           </div>
//           <CheckboxList
//             items={modules.map((it) => it.name).filter((it) => it !== undefined) as string[]}
//             value={selectedModuleIds}
//             className="w-full p-2"
//             onValueChange={(values) => {
//               console.info('newCheckedItems', values);
//               setSelectedModuleIds(values);
//             }}
//           />
//         </div>
//       </div>
//     );
//   }

//   function MoreInformation() {
//     return (
//       <div className="flex flex-col w-full space-y-2 divide-y">
//         <div className="p-1">
//           <span className="font-bold">Basic Info</span>
//           <FormLayout responsiveSteps={responsiveSteps} className="w-fit h-fit">
//             <TextField label="Gender" {...{ colspan: 1 }} {...field(model.gender)} />
//             <TextField label="Phone" {...{ colspan: 1 }} {...field(model.phone)} />
//             <TextField label="Mobile No" {...{ colspan: 1 }} {...field(model.mobileNo)} />
//             <DatePicker label="Birth Date" {...{ colspan: 1 }} {...field(model.birthDate)} />
//             <TextField label="Location" {...{ colspan: 1 }} {...field(model.location)} />

//             <TextArea
//               label="Interests"
//               {...{ colspan: 1 }}
//               {...field(model.interest)}
//               className="min-h-16"
//             />
//             <TextArea label="Bio" {...{ colspan: 1 }} {...field(model.bio)} className="min-h-16" />
//           </FormLayout>
//         </div>
//       </div>
//     );
//   }

//   function Settings() {
//     return (
//       <div className="flex flex-col w-full space-y-2 divide-y">
//         <AccordionRC
//           items={[
//             { title: 'Desk Settings', content: 'Content for item 1' },
//             { title: 'Change Password', content: 'Content for item 2' },
//             { title: 'Document Follow', content: 'Content for item 3' },
//             { title: 'Email', content: 'Content for item 3' },
//             { title: 'Security Settings', content: 'Content for item 3' },
//             { title: 'Third Party Authentication', content: 'Content for item 3' },
//             { title: 'API Access', content: 'Content for item 3' },
//           ]}
//         />
//       </div>
//     );
//   }

//   function Connections() {
//     return (
//       <div className="flex flex-col w-full space-y-2 divide-y">
//         <AccordionRC items={[{ title: 'Connections', content: 'Content for item 1' }]} />
//       </div>
//     );
//   }

//   const [tabHeaders] = useState([
//     'User Details',
//     'Roles & Permissions',
//     'More Information',
//     'Settings',
//     'Connections',
//   ]);
//   return (
//     <div className="w-full md:px-10 sm:px-0 ">
//       <div className="flex flex-col p-2 items-end">
//         <button
//           type="button"
//           className="bg-gray-100 hover:bg-gray-50 text-gray-800 rounded-xl py-1 px-4 shadow-md inline-flex items-center"
//         >
//           Save
//         </button>
//       </div>
//       <Tab.Group>
//         <Tab.List className="flex space-x-1 rounded-xl bg-blue-900/20 p-1">
//           {tabHeaders.map((category) => (
//             <TabHeader key={category} title={category} />
//           ))}
//         </Tab.List>
//         <Tab.Panels className="mt-2">
//           <TabPaneE>
//             <UserDetails />
//           </TabPaneE>
//           <TabPaneE>
//             <RolePermission />
//           </TabPaneE>
//           <TabPaneE>
//             <MoreInformation />
//           </TabPaneE>
//           <TabPaneE>
//             <Settings />
//           </TabPaneE>
//           <TabPaneE>
//             <Connections />
//           </TabPaneE>
//         </Tab.Panels>
//       </Tab.Group>
//       <div className="flex flex-col m-2">
//         <span className="font-bold text-lg">Comments</span>
//         <div className="inline-flex space-x-4 p-2 items-center">
//           <Avatar />
//           <TextField
//             placeholder="Type a reply / comment"
//             {...field(model.comments)}
//             className="w-full"
//           />
//         </div>
//         <span className="font-bold text-lg">Activity</span>
//       </div>
//     </div>
//   );
// }

// export default UserView;
