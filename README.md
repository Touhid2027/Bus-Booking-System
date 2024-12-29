# First Year Java Project(Bus Booking System)

This repository contains a simple **Bus Ticket Reservation System** project designed to make the process of booking bus tickets seamless and user-friendly. The system provides a basic console-based interface and handles various functionalities, including user registration, ticket booking, and transaction management.

## Table of Contents
- [Features](#features)
- [System Architecture](#system-architecture)
  - [UML Diagram](#uml-diagram)
  - [Classes and Methods](#classes-and-methods)
- [Application](#application)
- [Limitations](#limitations)
- [Future Work](#future-work)
- [Getting Started](#getting-started)

## Features

1. Easy and user-friendly interface.
2. Passwords secured in the database.
3. Organized list of destinations.
4. Simple ticket purchasing process.
5. Hassle-free transaction process.
6. Instant pay slip generation.
7. Accessible transaction history.

## System Architecture

### UML Diagram

```
LoginInfo                    busBookingMethods

+FirstPage(): void           +Destinations(): void
+Register(): void            +BuyTicket(): void
+LogIn(): void               +TransactionHistory(): void
                             +ViewTicket(): void

BusBookingSystem

- availableSeats: int[]
- passangerName: String
- passangerdest: String
- passangerfare: double
- passangerPhone: long
- isPaid: boolean

+options(): void
+Destinations(): void
+BuyTicket(): void
+ViewTicket(): void
+TransactionHistory(): void
```

### Classes and Methods

#### `LoginInfo` Class
Handles user login and registration information.

- **`FirstPage()`**: Prompts the user to register or log in.
- **`Register()`**: Saves user credentials in a `.txt` file.
- **`LogIn()`**: Validates user credentials against the stored data.

#### `busBookingMethods` Abstract Class
Defines the blueprint for the `BusBookingSystem` class with abstract methods like `Destinations()`, `BuyTicket()`, `TransactionHistory()`, and `ViewTicket()`.

#### `BusBookingSystem` Class
Handles core functionalities of ticket booking and transaction management.

- **`options()`**: Provides a menu for users to choose services.
- **`Destinations()`**: Displays destinations, fares, and available seats.
- **`BuyTicket()`**: Collects buyer details, saves them, and proceeds with the transaction process.
- **`ViewTicket()`**: Prints a pay slip after a successful transaction.
- **`TransactionHistory()`**: Displays recent transactions.

## Application

The primary goal of this project is to provide users with a simple interface to:
- Register or log in.
- View destinations and fares.
- Purchase tickets and complete transactions.
- Review transaction history.

## Limitations

1. Potential for unhandled type mismatch exceptions.
2. No graphical user interface (GUI).
3. No admin control for managing destinations or seat updates.

## Future Work

1. Implement a GUI for enhanced user interaction.
2. Add an admin access interface for updating destinations and seat availability.
3. Resolve existing bugs to improve system stability.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/Touhid2027/Bus-Booking-System.git
   ```

2. Open the project in your preferred IDE or text editor.

3. Run the main program to interact with the system.

