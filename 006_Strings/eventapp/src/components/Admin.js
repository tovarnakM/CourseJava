import React, { Component } from 'react';
import Events from './Events'
 
class Admin extends Component {
    
    render() { 
        return (
            <div>
                <Events {...this.props} isAdmin={true}/>
            </div>
        );
    }
}
 
export default Admin;