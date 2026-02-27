# Design Principles – SOLID (Java)

This repository is a **hands-on implementation of SOLID design principles in Java**, starting with the **Single Responsibility Principle (SRP)**.

The goal of this project is to build practical, clean examples for **all five SOLID principles** with simple and understandable code.

---

## 📌 What Are SOLID Principles?

SOLID is a set of five object-oriented design principles:

* **S** – Single Responsibility Principle (SRP)
* **O** – Open/Closed Principle (OCP)
* **L** – Liskov Substitution Principle (LSP)
* **I** – Interface Segregation Principle (ISP)
* **D** – Dependency Inversion Principle (DIP)

This repository will contain **dedicated implementations and examples for each principle**.

---

# ✅ Currently Implemented

## 1️⃣ Single Responsibility Principle (SRP)

> A class should have only one reason to change.

This example demonstrates SRP using a simple shopping cart system.

---

## 🏗 Project Structure

```
designPrinciples/
│
├── src/
│   ├── Main.java
│   └── solidPrinciples/
│       └── srp/
│           ├── Product.java
│           ├── ShoppingCart.java
│           ├── CartRepository.java
│           └── CartInvoicePrinter.java
```

---

## 🎯 Responsibility Breakdown

### `Product`

* Stores product name and price.
* No business logic.

### `ShoppingCart`

* Adds products.
* Calculates total price.
* Handles cart-related business logic only.

### `CartRepository`

* Responsible for saving cart data.
* Handles persistence only.

### `CartInvoicePrinter`

* Responsible for printing invoice.
* Handles presentation only.

### `Main`

* Client code to demonstrate usage.

---

## 🚀 Why This Follows SRP

Instead of putting:

* Cart logic
* Database logic
* Printing logic

Inside a single class ❌

We separate them into individual responsibilities ✅

This makes the code:

* Easier to maintain
* Easier to extend
* Easier to test
* Cleaner and scalable

---

## ▶️ How to Run

1. Open in IntelliJ IDEA (or any Java IDE).
2. Configure JDK.
3. Run `Main.java`.

### Expected Output

```
[DB] Saving 1 items to database.
--- INVOICE ---
GT 650 Chrome : ₹400000.0
TOTAL: ₹400000.0
Structure Verified, SRP
```

---

# 🚧 Upcoming Implementations

This repository will progressively include:

* Open/Closed Principle (OCP)
* Liskov Substitution Principle (LSP)
* Interface Segregation Principle (ISP)
* Dependency Inversion Principle (DIP)

Each principle will have:

* A bad design example ❌
* A refactored SOLID-compliant version ✅
* Clear explanation

---

## 🧠 Purpose of This Repository

* Strengthen understanding of SOLID principles
* Prepare for Low-Level Design interviews
* Practice writing clean and maintainable code
* Build strong object-oriented fundamentals

---

This is an evolving repository where all **SOLID principles will be implemented step-by-step** 🚀

## Made with Love ❤️ by Saksham


_Aspiring Low-Latency Systems Engineer_

[GitHub](https://github.com/0xSaksham) | [LinkedIn](https://in.linkedin.com/in/saksham-gupta-00a98221a) | [Blog](https://blog.0xsaksham.live/) | [Youtube](https://youtube.com/@0xsaksham) (Just for Updates)

---
