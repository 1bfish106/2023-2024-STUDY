const Base_URL = 'http://api.kcisa.kr/';
const API_KEY = 'e9c14682-a9e8-442b-8f93-777acf6032b6'

const getDateFormat = () => {
    const today = new Date();
    const year = today.getFullYear();
    const month = (today.getMonth() + 1 < 10) ? '0' + (today.getMonth() + 1) : (today.getMonth() + 1);
    const date = (today.getDate() < 10) ? '0' + today.getDate() : today.getDate();
    return `${year}${month}${date}`;
}

export async function getConcerList() {
    const url = `${Base_URL}openapi/CNV_060/request?serviceKey=${API_KEY}&numOfRows=10&pageNo=1&targetDt=${getDateFormat()}`;
    const response = await fetch(url, {
        method: 'GET',
        headers: {
            'accept': 'application/json'
        }
    });
    console.log(response);
    const data = await response.json();
    console.log(data.response.body.items.item);


    return data.response.body.items.item;
}
