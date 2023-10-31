# RecyclerView---Android
### Making a Scrollable List in Android using Recylerview

This Project contains code of this App 

https://github.com/GDSC23BundelkhandUniversity/RecyclerView---Android/assets/87789759/19d74945-6502-409d-9d81-b941e131e7a3


A RecyclerView is a fundamental component in Android app development that's used for displaying lists or grids of data. It's a more efficient and flexible way to handle large datasets compared to the older ListView and GridView components.

## What is a RecyclerView?

### A RecyclerView is a widget in Android that displays a scrollable list of items. It's commonly used for showing things like a list of contacts, messages, products, or any other kind of data that needs to be presented in a vertical or horizontal list.

## Why Use RecyclerView?

### The RecyclerView is preferred over older alternatives because it's more efficient and flexible. It can efficiently handle large datasets without consuming excessive memory and provides a clear separation between the data and how it's displayed.

## Components of RecyclerView:

### Adapter: The Adapter is a crucial part of the RecyclerView. It's responsible for binding your data to the individual views within the RecyclerView. You need to create a custom adapter class to tell the RecyclerView how to create and populate each item in the list.

### LayoutManager: The LayoutManager decides how items in the list are arranged. Common layouts include LinearLayoutManager for vertical or horizontal lists, GridLayoutManager for grids, and StaggeredGridLayoutManager for staggered grids.

### ViewHolder: A ViewHolder is a lightweight object that represents a single item in your list. This makes scrolling and item updates smoother because you don't have to repeatedly find and bind views.

## Basic Steps to Use RecyclerView:

### Define your data model: Decide what kind of data you want to display, e.g., a list of strings, a list of custom objects, etc.

### Create a layout for a single item: Design the XML layout for one item in your list. This is how each item will look in the RecyclerView.

### Create an Adapter: Implement a custom adapter class that extends RecyclerView.Adapter. This adapter will handle creating and binding ViewHolders.

### Implement a ViewHolder: Create a ViewHolder class that extends RecyclerView.ViewHolder. In the ViewHolder, you define references to the views in your item layout.

### Set up the RecyclerView: In your activity or fragment, define the RecyclerView in your XML layout and find it programmatically. Then set the adapter and layout manager for the RecyclerView.

### Populate the data: Provide your data to the RecyclerView's adapter. The adapter will create ViewHolders and bind your data to them.


# Task to Do - (Assignmnet)

Click on the Recyclerview Item and show a Toast message - "You Clicked on Image 1,2,3 etc" 

(Task Example Image on Right Side)

![task](https://github.com/GDSC23BundelkhandUniversity/RecyclerView---Android/assets/87789759/d361d2e7-9bfe-41e7-a856-483ad71e4c2b)

