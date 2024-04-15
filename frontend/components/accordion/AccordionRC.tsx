import { useState } from 'react';
import { FaChevronUp } from 'react-icons/fa';

interface AccordionItemProps {
  title: string;
  content: React.ReactNode;
}

function AccordionItem({ title, content }: AccordionItemProps) {
  const [isOpen, setIsOpen] = useState<boolean>(false);

  const toggleAccordion = () => {
    setIsOpen(!isOpen);
  };

  return (
    <div className="mx-auto w-full rounded-2xl bg-white p-2">
      <div
        role="button"
        tabIndex={0}
        className={`flex w-full justify-between rounded-lg bg-indigo-100 px-4 py-2 text-left text-sm font-medium text-indigo-900 hover:bg-indigo-200 focus:outline-none focus-visible:ring focus-visible:ring-indigo-500/75 cursor-pointer `}
        onClick={() => toggleAccordion()}
      >
        <span>{title}</span>
        <FaChevronUp
          className={`w-5 h-5 transition-transform transform ${isOpen ? 'rotate-180' : 'rotate-0'}`}
        />
      </div>
      {isOpen && (
        <div className="p-4">
          <p className="text-gray-600">{content}</p>
        </div>
      )}
    </div>
  );
}

interface AccordionProps {
  items: AccordionItemProps[];
}

function AccordionRC({ items }: AccordionProps) {
  return (
    <div className="border border-gray-200 rounded-2xl">
      {items.map((item) => (
        <AccordionItem key={item.title} title={item.title} content={item.content} />
      ))}
    </div>
  );
}

export default AccordionRC;
