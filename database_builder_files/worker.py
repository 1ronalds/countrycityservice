import csv

countries = []
countries_with_id = {}
cities = {}
with open('countries.sql', 'w', encoding='utf8') as countries_file:
    with open('C:\\Users\\ronalds.norvezs\\Downloads\\simplemaps_worldcities_basicv1.75\\worldcities.csv', 'r', encoding='utf8') as file:
        csvreader = csv.reader(file)
        for row in csvreader:
            country = row[4]
            if(country not in countries and country != 'country'):
                country.replace("'", "")
                countries.append(country)

        countries.sort()
        for i in range(1, len(countries)+1):
            countries_with_id[str(i)] = countries[i-1]

        for id in countries_with_id:
            country = countries_with_id[id]
            countries_file.write("INSERT INTO country(id, country) VALUE ('" + str(id) + "', '" + str(country) + "');" + "\n")

print("-----")
with open('cities.sql', 'w', encoding='utf8') as cities_file:
    with open('C:\\Users\\ronalds.norvezs\\Downloads\\simplemaps_worldcities_basicv1.75\\worldcities.csv', 'r', encoding='utf8') as file:
        csvreader = csv.reader(file)
        x = 0;
        for row, ii in zip(csvreader, range(1, 100000)):
            city = row[0]
            country.replace("'", "")
            country = row[4]
            country_id = int()
            for key, value in countries_with_id.items():
                if value == country:
                    x = x + 1
                    if(x%5==0):
                        country_id = key
                        row_id = str(int((ii-1)/5))
                        cities_file.write("INSERT INTO city(id, country_id, city) VALUE ('" + str(row_id) + "', '" + str(country_id) + "', '" + str(city) + "');" + "\n")
                        




        
