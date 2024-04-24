import ButtonRC, { ButtonRCProps } from '../button/ButtonRC';

type ActionTopBtnRCProps = {
  actions: ButtonRCProps[];
};
function ActionTopBtnRC({ actions }: ActionTopBtnRCProps) {
  return (
    <div className="inline-flex justify-end space-x-2 w-full p-2 text-sm">
      {actions.map((action) => (
        <ButtonRC
          key={`ac_btn${action.title}`}
          title={action.title}
          children={action.children}
          onClick={action.onClick}
        />
      ))}
    </div>
  );
}

export default ActionTopBtnRC;
