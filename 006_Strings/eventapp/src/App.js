import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import './style.css';
import Home from './components/Home';
import Events from './components/Events';
import Admin from './components/Admin';
import SignIn from './components/SignIn';
import { PrivateRoute } from './components/PrivateRoute';
import { PublicRoute } from './components/PublicRoute';
import EditEvent from './components/EditEvent';
import AddEvent from './components/AddEvent';
import Notfound from './components/Notfound';

const App = (props) =>  {
  return (
    <BrowserRouter>
      <Switch>
        <PrivateRoute {...props} exact path="/add_event" component={AddEvent} />
        <PrivateRoute {...props} exact path="/edit_event/:id" component={EditEvent} />
        <PublicRoute {...props} exact path="/sign_in" component={SignIn} />
        <PrivateRoute {...props} exact path="/admin" component={Admin} />
        <Route exact path="/events" component={Events} />
        <Route exact path="/" component={Home} />
        <Route component={Notfound} />
      </Switch>
    </BrowserRouter>
  );
};

export default App;