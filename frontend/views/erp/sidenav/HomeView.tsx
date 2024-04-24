import ViewShortcut from 'Frontend/components/ho_master/view/ViewShortcut';

const viewData = [
  {
    to: '/user',
    title: 'Users',
    description: 'Manage users',
  },
  {
    to: '/role',
    title: 'Roles',
    description: 'Manage roles',
  },
  {
    to: '/item',
    title: 'Item',
    description: 'Manage Item',
  },
  {
    to: '/user/_',
    title: 'Permission Manager',
    description: 'Manage Permission',
  },
  {
    to: '/user',
    title: 'Users Profile',
    description: 'Manage Profile',
  },
  {
    to: '/user',
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
