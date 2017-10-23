import json
import os


def get_user_values(json_file):
    username = []
    age = []
    gender = []
    member_since = []
    cities = []
    contributions = []
    countries = []
    locations = []
    miles = []
    percentage = []
    helpfulness = []

    with open(json_file, 'r') as f:
        content = f.read()
    f.close()
    json_file = json.dumps(json.loads(content), indent=4)

    splitted = json_file.split('\n')

    for line in splitted:
        line = line.strip('[]').strip()

        if '\": ' in line:
            tmp = line.split('\": ')
            key = tmp[0].strip('\":').strip()
            value = tmp[1].strip('\",').strip()

            if key == 'username':
                username.append(value)
            elif key == 'age':
                if value not in age:
                    age.append(value)
            elif key == 'gender':
                if value not in gender:
                    gender.append(value)
            elif key == 'member_since':
                member_since.append(value)
            elif key == 'cities':
                cities.append(value)
            elif key == 'contributions':
                contributions.append(value)
            elif key == 'countries':
                countries.append(value)
            elif key == 'location':
                locations.append(value)
            elif key == 'miles':
                miles.append(value)
            elif key == 'percentage':
                percentage.append(value)
            elif key == 'helpfulness':
                helpfulness.append(value)

    with open('separated_user_values/users.txt', 'w+') as file:
        for element in username:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/age.txt', 'w+') as file:
        for element in age:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/gender.txt', 'w+') as file:
        for element in gender:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/member_since.txt', 'w+') as file:
        for element in member_since:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/cities.txt', 'w+') as file:
        for element in cities:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/contributions.txt', 'w+') as file:
        for element in contributions:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/countries.txt', 'w+') as file:
        for element in countries:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/locations.txt', 'w+') as file:
        for element in locations:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/miles.txt', 'w+') as file:
        for element in miles:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/percentage.txt', 'w+') as file:
        for element in percentage:
            file.write(element)
            file.write('\n')
    file.close()

    with open('separated_user_values/helpfulness.txt', 'w+') as file:
        for element in helpfulness:
            file.write(element)
            file.write('\n')
    file.close()


def format_json(json_file):
    with open(json_file, 'r') as f:
        content = f.read()
    f.close()

    filename = json_file[json_file.rfind('/') + 1:json_file.rfind('.json')] + "_formatted.json"
    file = "formatted_json/users/" + filename
    with open(file, 'w+') as f:
        f.write(json.dumps(json.loads(content), sort_keys=True, indent=4))
    f.close()

if __name__ == '__main__':
    json_file = "/home/alex/Downloads/hotel_review_data/corpus-webis-tripad-14/users.json"
    get_user_values(json_file)

    # format_json(json_file)
    # json_dir = "/home/alex/Downloads/hotel_review_data/corpus-webis-tripad-14/reviews/"
    # for root, dirs, files in os.walk(json_dir, topdown=False):
    #     for file in files:
    #         format_json(os.path.join(root, file))
