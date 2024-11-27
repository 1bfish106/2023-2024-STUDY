import React, { useEffect, useState } from 'react';
import { getConcerList } from '../api/Consert';
import ConcertItem from '../components/ConcertItem';

function ConcertList() {
    const [concertList, setConcerts] = useState([]);

    useEffect(() => {
        getConcerList().then(data => {setConcerts(data); console.log("data : ", data)})
    }, []
    );

    return (
        <div>
            <h1>Concert List</h1>
                {concertList && concertList.map(concert => (<ConcertItem key={concert.eventPeriod} concert={concert} />
                ))}
        </div>
    );
}

export default ConcertList;
