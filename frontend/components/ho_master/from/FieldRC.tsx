import { AbstractModel } from '@hilla/form';
import { Checkbox } from '@hilla/react-components/Checkbox';
import { ComboBox } from '@hilla/react-components/ComboBox';
import { DatePicker } from '@hilla/react-components/DatePicker';
import { DateTimePicker } from '@hilla/react-components/DateTimePicker';
import { NumberField } from '@hilla/react-components/NumberField';
import { PasswordField } from '@hilla/react-components/PasswordField';
import { TextArea } from '@hilla/react-components/TextArea';
import { TextField } from '@hilla/react-components/TextField';
import { Upload } from '@hilla/react-components/Upload';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';
import ButtonRC from '../button/ButtonRC';
import { FromBuilderRCProps } from './FromBuilderRC';

function toCamelCase(str: string | undefined): string {
  return str?.replace(/(_\w)/g, (match) => match.toUpperCase().replace('_', '')) ?? '';
}

function resolvePropertyModel(modelInstance: AbstractModel, path: string): AbstractModel {
  const currentModel: AbstractModel | undefined = modelInstance;
  return (currentModel as any)[path];
}

function FieldRC({
  formController,
  item,
  className,
}: {
  formController: FromBuilderRCProps;
  item: DocFieldDto;
  className?: string;
}) {
  const { field, model } = formController;
  switch (item.fieldType) {
    case 'Data':
      return (
        <TextField
          label={item.label}
          helperText={item.description}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Link':
      return (
        <ComboBox
          label={item.label}
          helperText={item.description}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Check':
      return (
        <Checkbox
          label={item.label}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    //
    case 'Autocomplete':
      return (
        <Checkbox
          label={item.label}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Attach Image':
      return (
        <Upload
          method="PUT"
          target="/api/upload-handler"
          headers='{ "X-API-KEY": "7f4306cb-bb25-4064-9475-1254c4eff6e5" }'
        />
      );
    case 'Date':
      return (
        <DatePicker
          label={item.label}
          helperText={item.description}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Datetime':
      return (
        <DateTimePicker
          label={item.label}
          helperText={item.description}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Small Text':
      return (
        <TextArea
          label={item.label}
          helperText={item.description}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Password':
      return (
        <PasswordField
          label={item.label}
          helperText={item.description}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Int':
      return (
        <NumberField
          label={item.label}
          helperText={item.description}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Button':
      return (
        <ButtonRC
          onClick={() => {}}
          title={item.label}
          // className={className}
          // {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    case 'Read Only':
      return (
        <TextField
          readonly
          label={item.label}
          helperText={item.description}
          className={className}
          {...field(resolvePropertyModel(model, toCamelCase(item.fieldName)))}
        />
      );
    default:
      return null;
  }
}
export default FieldRC;
