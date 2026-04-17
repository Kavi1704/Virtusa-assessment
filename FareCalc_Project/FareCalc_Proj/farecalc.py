
rates = {
    "Economy": 10,
    "Premium": 18,
    "SUV": 25
}

# Function to calculate fare
def calculate_fare(km, vehicle_type, hour):
    if vehicle_type not in rates:
        return None

    base_fare = km * rates[vehicle_type]

    
    if 17 <= hour <= 20:
        surge_multiplier = 1.5
    else:
        surge_multiplier = 1

    final_fare = base_fare * surge_multiplier
    return final_fare



print("===== CityCab Fare Calculator =====")

try:
    distance = float(input("Enter Distance (km): "))
    vehicle = input("Enter Vehicle Type (Economy/Premium/SUV): ")
    hour = int(input("Enter Hour of Ride (0-23): "))

    fare = calculate_fare(distance, vehicle, hour)

    if fare is None:
        print("Service Not Available for selected vehicle type.")
    else:
        print("\n----- Ride Price Receipt -----")
        print("Distance Travelled :", distance, "km")
        print("Vehicle Type       :", vehicle)
        print("Ride Hour          :", hour)
        print("Total Fare         : Rs.", round(fare, 2))
        print("-------------------------------")

except:
    print("Invalid Input! Please enter correct values.")