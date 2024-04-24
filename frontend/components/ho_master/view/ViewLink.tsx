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
      className="bg-white border p-4 rounded-xl hover:shadow-md hover:no-underline"
      to={to}
      onClick={() => handleClick(header)}
    >
      <div>
        <p className="text-lg font-semibold">{header}</p>
        <p className="text-md">{description}</p>
      </div>
    </NavLink>
  );
}

export default ViewLink;
