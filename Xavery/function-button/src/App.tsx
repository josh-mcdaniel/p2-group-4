import './App.css';
import Button from "./components/FunctionButtonComponent";
import Shuffle from './components/Shuffle';

function App() {
  return (
    <>
      <h1>Colorful Custom Button Components</h1>
      <Button 
        border="solid"
        color="blue"
        height = "200px"
        onClick={Shuffle}
        radius = "50%"
        width = "200px"
        children = "Shuffle."
      />
    </>
  );
}

export default App;