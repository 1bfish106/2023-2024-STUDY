import {Link} from "react-router-dom";
function ConcertItem({concert}) {
    return (
        <Link to={`/concert/${concert.title}`}>
            <div>
                   <h3>제목 : {concert.title}</h3>
                   <h3>시간 : {concert.eventPeriod}</h3>
                   <h3>장소 : {concert.eventSite}</h3>
                   <h3>금액 : {concert.charge}</h3>
            </div>
        </Link>
    )
}

export default ConcertItem;