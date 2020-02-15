import React, { Component } from 'react';
import CardList from './CardList';
import Header from './Header';
 
class Events extends Component {

    state = {
        events: [],
        searchBox: '',
        filteredEvents: []
    }

    componentDidMount(){
        fetch('http://localhost:3001/events')
            .then(resp => resp.json())
            .then(data => {
                this.setState({filteredEvents: data, events: data})
            })
    }

    handleInput = (event) => {
        const filtered = this.state.events.filter((events) => {
            return events.title.toLowerCase().includes(event.target.value.toLowerCase())
        })
        this.setState({filteredEvents: filtered})
    }

    render() {
        return (
            <div>
                <Header />
                <div className="searchBox">
                    <div style={{fontSize: '1.35rem'}}>Find your event here:</div>
                    <input 
                        className="searchBox-property" 
                        type="text" 
                        onChange={(event) => this.handleInput(event)}    
                    />
                </div>
                <CardList events={this.state.filteredEvents} isAdmin={this.props.isAdmin} />
            </div>
        );
    }
}
 
export default Events;