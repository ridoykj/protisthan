import { ConfirmDialog } from '@hilla/react-components/ConfirmDialog';
import { SplitLayout } from '@hilla/react-components/SplitLayout';
import { UseFormResult } from '@hilla/react-form';
import RippleDivRC from 'Frontend/components/effects/ripple/div/RippleDivRC';
import NotificationUtil from 'Frontend/util/NotificationUtil';
import { Dispatch, SetStateAction, useState } from 'react';
import { FaXmark } from 'react-icons/fa6';

type SideCrudRCProps = {
  primary: React.ReactNode;
  secondary: React.ReactNode;
  form: UseFormResult<any>;
  onConfirm: () => Promise<boolean | undefined | void>;
  showSidebar: boolean;
  setShowSidebar: Dispatch<SetStateAction<boolean>>;
};

// const SideCrudRC: React.FC<SideCrudRCProps> = (props) => {
function SideCrudRC(props: SideCrudRCProps) {
  const { primary, secondary, form, showSidebar, setShowSidebar, onConfirm } = props;
  const { value, submit, reset, dirty, invalid, submitting } = form;

  const [dialogOpened, setDialogOpened] = useState<boolean>(false);
  const [successNotification, setSuccessNotification] = useState<boolean>(false);
  const [errorNotification, setErrorNotification] = useState<boolean>(false);

  return (
    <>
      <SplitLayout className="w-full h-full">
        <div
          className={`relative h-full flex flex-col items-stretch sm:w-full ${showSidebar ? 'w-0' : 'w-full'}`}
        >
          {primary}
        </div>
        <div
          className={`flex flex-col w-full ease-in-out duration-300 ${showSidebar ? 'translate-x-0 sm:w-1/4 w-full min-w-96' : 'translate-x-full w-0 hidden'}`}
        >
          <header className="flex-grow-0 w-full bg-blue-600 text-white rounded-2xl">
            <div className="flex flex-row space-x-4">
              <p className="text-lg font-sans font-semibold p-1 m-1 w-full">
                #{(value as any).id ?? ''} - Coordinator
              </p>
              <button
                type="button"
                className="right-5 top-5 text-white content-end px-4 hover:bg-blue-700 rounded-full"
                onClick={() => setShowSidebar(false)}
                title="Close Sidebar"
              >
                <FaXmark />
              </button>
            </div>
          </header>
          <main className="overflow-y-scroll w-full h-full">{secondary}</main>
          <footer className="flex-grow-0 w-full rounded-2xl p-1 text-white">
            {!dirty ? (
              <div className="w-full">
                {(value as any).id && (
                  <button
                    type="button"
                    title="Delete Item"
                    className=" bg-red-500 hover:bg-red-600 rounded-xl p-2 px-4 shadow-md"
                    onClick={() => {
                      setDialogOpened(true);
                    }}
                  >
                    Delete
                  </button>
                )}
              </div>
            ) : (
              <div className="flex flex-row space-x-2 w-full">
                <RippleDivRC className="flex-grow-1 w-full rounded-full ring-2 ring-gray-400">
                  <button
                    type="button"
                    title="Discard Changes"
                    className="w-full py-2 font-sans font-medium text-center text-gray-500 shadow-md shadow-gray-900/10 hover:bg-gray-100 hover:shadow-gray-900/20 focus:opacity-[0.85] focus:shadow-none"
                    disabled={!dirty}
                    onClick={(event) => {
                      reset();
                    }}
                  >
                    Discard
                  </button>
                </RippleDivRC>
                <RippleDivRC className="flex-grow-1 w-full rounded-full">
                  <button
                    type="button"
                    title="Save Item"
                    className="w-full py-2 font-sans font-medium text-center shadow-md shadow-blue-900/10 bg-blue-600 hover:bg-blue-500 hover:shadow-blue-900/20 focus:opacity-[0.85] focus:shadow-none disabled:bg-gray-300"
                    disabled={invalid || submitting || !dirty}
                    onClick={(event) => {
                      submit().then(() => {
                        setSuccessNotification(true);
                        setShowSidebar(false);
                      });
                    }}
                  >
                    {(value as any).id !== undefined ? 'Update' : 'Save'}
                  </button>
                </RippleDivRC>
              </div>
            )}
          </footer>
        </div>
      </SplitLayout>
      <NotificationUtil
        opened={successNotification}
        type="update"
        message={{
          title: 'Updated',
          description: 'The item has been successfully updated.',
        }}
        onOpenedChanged={(event) => {
          if (!event.detail.value) {
            setSuccessNotification(event.detail.value);
          }
        }}
        onClick={() => {
          setSuccessNotification(false);
        }}
      />
      <NotificationUtil
        opened={errorNotification}
        type="error"
        message={{
          title: 'Unable to delete item',
          description: 'Please check and delete all the child items first',
        }}
        onOpenedChanged={(event) => {
          if (!event.detail.value) {
            setErrorNotification(event.detail.value);
          }
        }}
        onClick={() => {
          setErrorNotification(false);
        }}
      />
      <ConfirmDialog
        header="Delete Item"
        cancelButtonVisible
        rejectButtonVisible
        rejectText="Discard"
        confirmText="Confirm"
        confirmTheme="error primary"
        opened={dialogOpened}
        onOpenedChanged={(event) => {
          setDialogOpened(event.detail.value);
          if (event.detail.value) {
            // setStatus('');
          }
        }}
        onConfirm={() =>
          onConfirm().then(() => {
            console.log('');
          })
        }
      >
        {`Do you want to delete?${(value as any).person?.givenName}`}
      </ConfirmDialog>
    </>
  );
}

export default SideCrudRC;
