import {Link} from "react-router-dom";

function Navbar() {
    return (
        <div>
            <ul>
                <li>
                    <Link to="/">HOME</Link>
                </li>
                <li>
                    <Link to="/about">ABOUT</Link>
                </li>
                <li>
                    <Link to="/menu">MENU</Link>
                </li>
            </ul>
        </div>
    );
}

export default Navbar;