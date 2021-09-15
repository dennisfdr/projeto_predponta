import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3" >Dashboard</h1>

                <div className="row px 3">

                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary"> Vendas</h5>
                        <BarChart />
                    </div>

                    <div className="col-sm-6">
                        <h5>Gráfico de Donuts</h5>
                        <DonutChart />
                    </div>

                    <div className="py-3">
                        <h2 className="text-primary">Todas as Vendas</h2>
                    </div>

                </div>

                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;