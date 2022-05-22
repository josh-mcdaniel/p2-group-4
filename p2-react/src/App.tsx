import React from 'react';

import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { Login } from './components/Login/Login';
import { MainPage } from './components/MainPage/mainpage'
import { Game } from './components/Game/Game';

function App() {
    return (
        <div className="App">
            <Router>
                <Routes>
                    <Route path="/" element={<Login/>}/>
                </Routes>
                <Routes>
                    <Route path="/home" element={<MainPage/>}/>
                </Routes>
                <Routes>
                    <Route path='/game' element={<Game/>}/>
                </Routes>
                <Routes>
                    <Route path='/myScore' element={<Game/>}/>
                </Routes>
            </Router>
        </div>

    );
}

export default App;