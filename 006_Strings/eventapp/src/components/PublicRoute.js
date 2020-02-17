import React from 'react';
import { Route, Redirect } from 'react-router-dom';

export const PublicRoute = ({
    user,
    component: Component,
    ...rest
}) => {
    return <Route {...rest} component={(props) => (
        user ?
            <Redirect to="/edit_event" />
        :
            <Component {...props} user={user}/>
    )}/>
};

