import React from 'react';

const CardList = (props) => {
    
    const renderEventsUser = () => {
        return props.events.map((event) => (
            <div key={event.id} className="cardList__item">
                <div className="eventInfo">
                    <div style={{fontSize: '4rem'}}>{event.title}</div>
                    <div style={{fontSize: '2.5rem', marginTop: '1.8rem'}}>{event.date}</div>
                    <div style={{fontSize: '1.5rem', marginTop: '1rem'}}>Location: {event.location}</div>
                    <div className="info_container">
                        <div>Date: {event.date}</div>
                        <div>Price: {event.price}$</div>
                    </div>
                </div>
            </div>
        ))
    }

    const renderEventsAdmin = () => {
        return props.events.map((event,i) => {
            return <div key={i} className="cardList__item">
                        <div className="eventInfo">
                            <div style={{fontSize: '4rem'}}>{event.title}</div>
                            <div style={{fontSize: '2.5rem', marginTop: '1.8rem'}}>{event.date}</div>
                            <div style={{fontSize: '1.5rem', marginTop: '1rem'}}>Location: {event.location}</div>
                            <div className="info_container">
                                <div>Date: {event.date}</div>
                                <div>Price: {event.price}$</div>
                            </div>
                            <button style={{marginTop: '1rem'}} className="header-button">Edit event</button>
                        </div>
                    </div>
        })
    }


    return (
        <div>            
            {   
                props.isAdmin ?
                    <div className="cardList">
                        <div className="cardList__item">
                            <div className="addEventToExisting">
                                <div>
                                    <h1>+</h1>
                                </div>
                                <p>Add New Event</p>
                            </div> 
                        </div>
                        {renderEventsAdmin()} 
                    </div>
                : 
                <div className="cardList">
                    {renderEventsUser()}
                </div>
            }
        </div>
    );
};

export default CardList;