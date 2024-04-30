import {Link} from "react-router-dom";
function PlaceoncertItem({placeConcert}) {
    return (
        <Link to={`/placeConcert/${placeConcert.title}`}>
            <div>
                <h3>제목 : {placeConcert.title}</h3>
                <h3>시간 : {placeConcert.eventSite}</h3>
                <h3>장소 : {placeConcert.charge}</h3>
                <h3>금액 : {placeConcert.audience}</h3>
            </div>
        </Link>
    )
}

export default PlaceoncertItem;