import { NavLink } from 'react-router-dom';

function HomeView() {
  const handleClick = (title: string) => {
    document.title = title;
  };
  return (
    <>
      <h1 className="font-bold text-lg">Your Shortcuts</h1>
      <div className="grid grid-cols-3 gap-4 mx-2">
        <div className="bg-white p-4 rounded-lg shadow-md">
          <p className="text-lg font-bold">Users</p>
          <NavLink
            className="bg-blue-500 hover:no-underline hover:text-blue-600"
            to="/users"
            onClick={() => handleClick('Users')}
          >
            <p className="text-md">Manage users</p>
          </NavLink>
        </div>
        <div className="bg-white p-4 rounded-lg shadow-md">
          <p className="text-lg font-bold">Roles</p>
          <p className="text-md">Manage roles</p>
        </div>
        <div className="bg-white p-4 rounded-lg shadow-md">
          <p className="text-lg font-bold">Resources</p>
          <p className="text-md">Manage resources</p>
        </div>
        <div className="bg-white p-4 rounded-lg shadow-md">
          <p className="text-lg font-bold">Users</p>
          <p className="text-md">Manage users</p>
        </div>
        <div className="bg-white p-4 rounded-lg shadow-md">
          <p className="text-lg font-bold">Roles</p>
          <p className="text-md">Manage roles</p>
        </div>
        <div className="bg-white p-4 rounded-lg shadow-md">
          <p className="text-lg font-bold">Resources</p>
          <p className="text-md">Manage resources</p>
        </div>
      </div>
    </>
  );
}

export default HomeView;
