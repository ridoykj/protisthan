import { FaBarsProgress } from 'react-icons/fa6';
import { NavLink } from 'react-router-dom';

function ViewShortcut({
  to,
  title,
  description,
}: {
  to: string;
  title: string;
  description: string;
}) {
  const handleClick = (titleE: string) => {
    document.title = titleE;
  };
  return (
    <NavLink
      className="bg-white text-md font-medium hover:font-semibold hover:text-indigo-800 border p-4 rounded-xl hover:shadow-md hover:no-underline"
      to={to}
      onClick={() => handleClick(title)}
    >
      <div className="inline-flex gap-2">
        <FaBarsProgress className="flex-none size-6" />
        <p>{title}</p>
      </div>
    </NavLink>
  );
}

export default ViewShortcut;
