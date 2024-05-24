import { useEffect, useState } from 'react';

type MapItem = {
  key: string;
  value: boolean;
};

type CheckboxListProps = {
  lable?: string;
  className?: string;
  onValueChange?: (values: string[]) => void;
  items: string[];
  value?: string[];
  onLabelClick?: (item: string) => void;
  lableClick?: boolean;
};
function CheckboxList({
  lable,
  className,
  onValueChange,
  items,
  value,
  onLabelClick,
  lableClick,
}: CheckboxListProps) {
  const [checkedItems, setCheckedItems] = useState<MapItem[]>([]);
  useEffect(() => {
    setCheckedItems(items.map((it) => ({ key: it, value: value?.includes(it) || false })));
  }, [value, items]);

  const handleCheckboxChange = (item: string) => {
    // if items key matches the item key, then toggle the value
    const newCheckedItems = checkedItems.map((it) =>
      it.key === item ? { key: it.key, value: !it.value } : it
    );
    setCheckedItems(newCheckedItems);
    if (onValueChange) {
      onValueChange(newCheckedItems.filter((it) => it.value).map((it) => it.key));
    }
  };

  return (
    <div className={className}>
      <h2>{lable}</h2>
      <ul className="columns-3xs gap-2 space-y-2 w-full">
        {checkedItems.map((item, index) => (
          <li key={`cb-lable-${item.key}`} className="flex items-center me-4">
            <label htmlFor={`checkbox-${item.key}`} className="cursor-pointer label space-x-1">
              <input
                type="checkbox"
                id={`checkbox-${item.key}`}
                checked={checkedItems[index].value}
                onChange={() => handleCheckboxChange(item.key)}
                className="accent-indigo-500 cursor-pointer "
              />
              {!lableClick && <span className="label-text">{item.key}</span>}
            </label>
            {lableClick && (
              <span
                className="label-text hover:underline cursor-pointer"
                role="button"
                tabIndex={0}
                onClick={(e) => {
                  onLabelClick?.(item.key);
                }}
              >
                {item.key}
              </span>
            )}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default CheckboxList;
