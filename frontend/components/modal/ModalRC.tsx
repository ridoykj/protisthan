import { FaX } from 'react-icons/fa6';

function ModalRC({
  open,
  onClose,
  children,
}: {
  open: boolean;
  onClose: () => void;
  children: React.ReactNode;
}) {
  return (
    <div
      role="button"
      tabIndex={0}
      onClick={onClose}
      className={`
            fixed inset-0 flex justify-center items-center transition-colors
            ${open ? 'visible bg-black/20' : 'invisible'}
          `}
    >
      {/* modal */}
      <div
        role="button"
        tabIndex={0}
        onClick={(e) => e.stopPropagation()}
        className={`
              bg-white rounded-xl shadow p-6 transition-all
              ${open ? 'scale-100 opacity-100' : 'scale-125 opacity-0'}
            `}
      >
        <button
          type="button"
          onClick={onClose}
          className="absolute top-2 right-2 p-1 rounded-lg text-gray-400 bg-white hover:bg-gray-50 hover:text-gray-600"
        >
          <span className="sr-only">No Content</span>
          <FaX />
        </button>
        {children}
      </div>
    </div>
  );
}

export default ModalRC;
