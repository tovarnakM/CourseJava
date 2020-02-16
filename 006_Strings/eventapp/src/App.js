import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import './style.css';
import Home from './components/Home';
import Events from './components/Events';
import Admin from './components/Admin';
import SignIn from './components/SignIn';

const App = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/sign_in" component={SignIn} />
        <Route exact path="/edit_event" component={Admin} />
        <Route exact path="/events" component={Events} />
        <Route exact path="/" component={Home} />
      </Switch>
    </BrowserRouter>
  );
};

export default App;