import ViewShortcut from 'Frontend/components/ho_master/view/ViewShortcut';

const viewData = [
  {
    to: '/m/user',
    title: 'Users',
    description: 'Manage users',
  },
  {
    to: '/m/role',
    title: 'Roles',
    description: 'Manage roles',
  },
  {
    to: '/m/item',
    title: 'Item',
    description: 'Manage Item',
  },
  {
    to: '/m/user/_',
    title: 'Permission Manager',
    description: 'Manage Permission',
  },
  {
    to: '/m/user',
    title: 'Users Profile',
    description: 'Manage Profile',
  },
  {
    to: '/m/user-type',
    title: 'User Type',
    description: 'Manage User Type',
  },
];

function HomeView() {
  return (
    <>
      <h1 className="font-bold text-lg">Your Shortcuts</h1>
      <div className="grid grid-cols-3 gap-4 mx-2">
        {viewData.map((data) => (
          <ViewShortcut
            key={data.title}
            to={data.to}
            title={data.title}
            description={data.description}
          />
        ))}
      </div>
    </>
  );
}

export default HomeView;
