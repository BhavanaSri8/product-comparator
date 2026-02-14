# 🛒 Product Management System (Java – Map, Streams & Switch Menu)

## 📌 Project Overview

This is a console-based **Product Management System** built using:

- Java OOP Concepts
- Collections Framework (HashMap)
- Comparable Interface
- Comparator
- Stream API
- Switch-based Menu System

The system allows managing products with filtering, sorting, and searching features.

---

## 🏗 Project Structure
<img width="402" height="168" alt="image" src="https://github.com/user-attachments/assets/f62ba3be-5069-43b1-b5b1-ed22012b8dbb" />


---

## 📦 Product Class

The `Product` class represents a product entity.

### 🔹 Fields

- `id` – Unique product ID
- `pName` – Product name
- `cost` – Product price
- `brand` – Brand name
- `category` – Product category
- `rating` – Product rating
- `discountPercentage` – Discount percentage

### 🔹 Features

- Implements `Comparable<Product>`
- Default sorting by product name
- Proper `toString()` method for display

---

## 🗂 ProductManagerMap

Uses:

```java
Map<Integer, Product> mpp = new HashMap<>();

---

<img width="1499" height="724" alt="image" src="https://github.com/user-attachments/assets/60989d18-02a3-435c-8085-ddc22d7a9b66" />
<img width="1564" height="588" alt="image" src="https://github.com/user-attachments/assets/132dacb7-cf17-4b34-88f9-bd1a128e1121" />
<img width="1418" height="635" alt="image" src="https://github.com/user-attachments/assets/4b3d4780-99e7-4e02-a281-8a9a6fac5664" />
<img width="1400" height="662" alt="image" src="https://github.com/user-attachments/assets/4b02c3bb-40d0-4b3b-8dc6-da415f124eef" />
<img width="1773" height="543" alt="image" src="https://github.com/user-attachments/assets/8b47b6cb-dbf1-4454-90e1-a883e7abcf5c" />

