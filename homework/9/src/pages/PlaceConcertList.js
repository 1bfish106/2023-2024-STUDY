import React, { useEffect, useState } from 'react';
import {place} from '../api/PlaceConcertAPI';
import PlaceConcertItem from '../components/PlaceConcertItem';

function PlaceConcertList() {
    const [placeConcert, setConcerts] = useState([]);

    useEffect(() => {
        place().then(data => {setConcerts(data); console.log("data : ", data)})
        }, []
    );

    return (
        <div>
            <h1>placeConcert List</h1>
            {placeConcert && placeConcert.map(placeConcert => (<PlaceConcertItem key={placeConcert.title} placeConcert={placeConcert} />
            ))}
        </div>
    );
}

export default PlaceConcertList;
