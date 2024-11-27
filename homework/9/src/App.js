import {BrowserRouter, Route, Routes} from "react-router-dom";
import Layout from "./layouts/Layout";
import Main from "./pages/Main";
import ConcertList from "./pages/ConcertList";
import PlaceConcertList from "./pages/PlaceConcertList";

function App() {
  return (
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Layout/>}>
            <Route index element={<Main/>}/>
            <Route path="concert">
                <Route index element={<ConcertList/>}/>
            </Route>
              <Route path="placeConcert">
                  <Route index element={<PlaceConcertList/>}/>
              </Route>
          </Route>
        </Routes>
      </BrowserRouter>
  );
}

export default App;