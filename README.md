# SOLID Principles Refactoring: Order Processing Example

## Problem Description

The original code violates multiple SOLID principles:

- **Single Responsibility Principle (SRP)**: `OrderAction` and the `Order` interface mix unrelated responsibilities (calculating totals, placing orders, generating invoices, and sending emails). A class should have only **one** reason to change.
- **Interface Segregation Principle (ISP)**: The fat `Order` interface forces every implementer to provide all four methods, even when some are not needed (as noted in the original `OrderTest` comment).
- **Dependency Inversion Principle (DIP)**: High-level code depends on concrete classes instead of abstractions.
- **Open-Closed Principle (OCP)**: Adding new behaviour (e.g. a new invoice format or notification method) requires modifying existing classes.
- **Liskov Substitution Principle (LSP)**: The original design does not support safe substitution of different implementations.

This results in rigid, hard-to-test, and non-extensible code.

## Solution (Refactored Design)

- `Order` is now a simple **entity** class responsible only for its own data and total calculation (**SRP**).
- Responsibilities are split into small, focused interfaces (**ISP**).
- Concrete implementations are provided for each interface.
- `OrderProcessor` depends only on **abstractions** (interfaces) via constructor injection (**DIP**).
- New placement, invoice, or notification strategies can be added without changing existing code (**OCP**).
- Concrete classes can safely replace their interface types (**LSP**).

