import BarChart from "components/BarChart";
import DataLabel from "components/DataLabel";
import DonutsChart from "components/DonutsChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard de vendas</h1>

                <div className="row px-3">
                <div className="col-sm-6">
                    <h5 className="text-center text-secondary">Taxa de sucesso</h5>
                    <BarChart />
                </div>
                <div className="col-sm-6">
                    <h5 className="text-center text-secondary">Todas as vendas</h5>
                    <DonutsChart />
                </div>
                </div>

                <div className="py-3">
                <h2 className="text-primary">Todas as vendas</h2>
                </div>
                <DataLabel />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;