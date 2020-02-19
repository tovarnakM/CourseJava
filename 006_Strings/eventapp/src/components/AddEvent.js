import React, { Component } from 'react';
import Header from './Header';
import { Link } from 'react-router-dom';
const axios = require('axios');
 
class AddEvent extends Component {

    state = {
        event: {
            title: 'Enter title',
            date: 'Enter date',
            location: 'Enter location',
            price: 'Enter Price'
        }
    }

    handleEvents = (keyName, event) => {
        const eventData = this.state.event;
        for (let key in eventData){
            if (key === keyName){
                eventData[key] = event.target.value;
            }
        }
        this.setState({event: eventData});
    }

    addEvent = () => {
        const eventData = this.state.event;
        return Object.keys(eventData).map((keyName, i) => (
             <div key={i} style={{display: 'flex', justifyContent: 'center'}}>
                <input 
                    key={i} 
                    placeholder={eventData[keyName]}
                    onChange={(event) => this.handleEvents(keyName,event)}    
                /> 
            </div>
        ))
    }

    handleAddButton = () => {
        axios.post('http://localhost:3001/events', {
            id: 5,
            ...this.state.event
        }).then(resp => {
            this.props.history.push("/admin");
        }).catch(error => {
            console.log(error);
        });   
    }

    render() { 
        return (
            <div>
                <Header>
                    <div className="header__right">
                        <Link to="/admin">
                            <button className="header-button">Back to admin</button>
                        </Link>
                    </div>
                </Header>
                <div className="form">
                    <div className="form__title">Add event.</div>
                    {this.addEvent()}
                
                <button style={{marginRight: '1rem'}} onClick={() => this.handleAddButton()}>Add</button>
                </div>
            </div>
        );
    }
}
 
export default AddEvent;