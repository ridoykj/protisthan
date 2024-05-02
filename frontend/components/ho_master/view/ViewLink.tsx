import { FaLink } from 'react-icons/fa';
import { NavLink } from 'react-router-dom';

function ViewLink({
  to,
  title: header,
  description,
}: {
  to: string;
  title: string;
  description: string;
}) {
  const handleClick = (title: string) => {
    document.title = title;
  };
  return (
    <NavLink
      className="bg-white text-md font-medium hover:font-semibold hover:text-indigo-800 border p-2 rounded-xl hover:shadow-md hover:no-underline "
      to={to}
      onClick={() => handleClick(header)}
    >
      <div className="inline-flex gap-2">
        <FaLink className="flex-none size-4" />
        <p>{header}</p>
      </div>
    </NavLink>
  );
}

export default ViewLink;
