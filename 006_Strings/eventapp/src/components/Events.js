import React, { Component } from 'react';
import CardList from './CardList';
import Header from './Header';
 
class Events extends Component {

    state = {
        events: [],
        searchBox: '',
        filteredEvents: [],
        isLoading: true,
    }

    componentDidMount(){
        fetch('http://localhost:3001/events')
            .then(resp => resp.json())
            .then(data => {
                this.setState({filteredEvents: data, events: data, isLoading: false})
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
                    <div style={{fontSize: '1.1rem'}}>Find your event here:</div>
                    <input 
                        className="searchBox-property" 
                        type="text"
                        placeholder="Type something ..." 
                        onChange={(event) => this.handleInput(event)}    
                    />
                </div>

                {
                    this.state.isLoading ? 
                        <div>
                            <h1 style={{textAlign: 'center'}}>
                                Loading ...
                            </h1>
                        </div>
                    :
                    
                    <CardList 
                        events={this.state.filteredEvents} 
                        isAdmin={this.props.isAdmin}     
                    />
                }

            </div>
        );
    }
}
 
export default Events;