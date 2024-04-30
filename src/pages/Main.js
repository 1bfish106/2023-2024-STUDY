import {Link} from "react-router-dom";

function Main() {
    return (
        <>
        <Link to="/concert">
            <div className="content-row">
                <h1>문화예술공연 목록 보러가기</h1>
            </div>
        </Link>

        <Link to="/placeconcert">
            <div className="content-row">
                <h1>기관공연정보 목록 보러가기</h1>
            </div>
        </Link>

        </>
    );
}

export default Main;