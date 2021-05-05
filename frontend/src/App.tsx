import DataLabel from "components/DataLabel";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="App">
        <h1 className="text-primary">Olá mundo</h1>
      </div>
      <DataLabel />
      <Footer />
    </>
  );
}

export default App;
