import { Button } from '@hilla/react-components/Button';
import { Dialog } from '@hilla/react-components/Dialog.js';
import React from 'react';
import { FaX } from 'react-icons/fa6';

type DialogFromRCProps = {
  header: string;
  children?: React.ReactNode;
  opened: boolean;
  submitDisabled?: boolean;
  update: boolean;
  onOpenedChanged: (value: boolean) => void;
  submit?: () => void;
  onNavigate?: () => void;
};

function DialogFromRC({
  header,
  opened,
  onOpenedChanged,
  children,
  submit,
  submitDisabled,
  update,
  onNavigate,
}: DialogFromRCProps) {
  return (
    <Dialog
      modeless
      draggable
      resizable
      opened={opened}
      overlayClass="w-1/2"
      onOpenedChanged={(event) => onOpenedChanged(event.detail.value)}
      headerRenderer={() => (
        <>
          <h2 className="draggable flex-1 cursor-move margin-0 font-bold text-2xl padding-m-0">
            {header}
          </h2>
          <button
            type="button"
            className="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
            onClick={() => {
              onOpenedChanged(false);
            }}
          >
            <FaX /> <span className="sr-only">Close</span>
          </button>
        </>
      )}
      footerRenderer={() => (
        <>
          <Button
            className="content-end px-4 py-1 hover:no-underline rounded-full border-2 border-gray-500 text-gray-500 hover:bg-gray-500 hover:text-white"
            onClick={() => {
              onNavigate?.();
            }}
          >
            Edit Full From
          </Button>
          <Button
            className={`text-white disabled:opacity-75 ${submitDisabled ? 'bg-blue-500 hover:bg-blue-700' : 'bg-gray-300'}`}
            disabled={submitDisabled}
            onClick={submit}
          >
            {update ? 'Update' : 'Add'}
          </Button>
        </>
      )}
    >
      {children}
    </Dialog>
  );
}

export default DialogFromRC;
