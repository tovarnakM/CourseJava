import React, { Component } from 'react';
import Header from './Header';
import { Link } from 'react-router-dom';
 
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
        fetch('http://localhost:3005/add_event', {
            method: 'post',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(this.state.event),
        })
        .then(this.props.history.push('/admin'))
        .catch(e => {
            console.log("Post failed");
        })
    }
    
    render() {
        console.log(this.state.event)
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