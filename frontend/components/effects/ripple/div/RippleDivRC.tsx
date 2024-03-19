import React, { useEffect, useState } from 'react';
import './RippleDivRC.css';
interface RippleDivRCProps {
  children?: React.ReactNode;
  className?: string;
}
// https://codesandbox.io/p/sandbox/react-button-ripple-effect-z8rqw?file=%2Fsrc%2Fcomponents%2FRipple.styled.js%3A16%2C21-16%2C27
const RippleDivRC: React.FC<RippleDivRCProps> = ({ children, className }) => {
  const [coords, setCoords] = useState({ x: -1, y: -1 });
  const [rippleActive, setRippleActive] = useState(false);

  useEffect(() => {
    if (coords.x !== -1 && coords.y !== -1) {
      setRippleActive(true);
      setTimeout(() => setRippleActive(false), 1000);
    } else setRippleActive(false);
  }, [coords]);

  useEffect(() => {
    if (!rippleActive) setCoords({ x: -1, y: -1 });
  }, [rippleActive]);

  return (
    <div className={`ripple-div ${className ?? ''}`} onClick={e => {
      const rect = (e.target as HTMLElement).getBoundingClientRect();
      setCoords({ x: e.clientX - rect.left, y: e.clientY - rect.top });
    }}>
      {rippleActive ?
        <span className="ripple-span" style={{ left: coords.x, top: coords.y } as React.CSSProperties} />
        : ''
      }
      {children}
    </div>
  );
};

export default RippleDivRC;