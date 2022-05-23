
import React from 'react'
import { useNavigate } from 'react-router-dom';

export interface ICountdown {
    
    minutes: number;
    seconds: number;
}

const CountDownTimer = ({minutes = 0, seconds = 60 }: ICountdown) => {
    

    const [time, setTime] = React.useState<ICountdown>({minutes, seconds});
    
    const navigate = useNavigate();
    const tick = () => {
   
        if (time.minutes === 0 && time.seconds === 0) 
            navigate('/home');
         else if (time.seconds === 0) {
            setTime({minutes: time.minutes - 1, seconds: 59});
        } else {
            setTime({minutes: time.minutes, seconds: time.seconds - 1});
        }
    };


    const reset = () => setTime({minutes: time.minutes, seconds: time.seconds});

    
    React.useEffect(() => {
        const timerId = setInterval(() => tick(), 1000);
        return () => clearInterval(timerId);
    });

    
    return (
        <div>
            <p >{`${time.minutes
            .toString()
            .padStart(2, '0')}:${time.seconds.toString().padStart(2, '0')}`}</p> 
        </div>
    );
}

export default CountDownTimer;