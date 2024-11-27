const Base_URL = 'http://api.kcisa.kr/';
const API_KEY = '2ae8c148-df74-4c86-9902-ca893fedb5ca';

const getDateFormat = () => {
    const today = new Date();
    const year = today.getFullYear();
    const month = (today.getMonth() + 1 < 10) ? '0' + (today.getMonth() + 1) : (today.getMonth() + 1);
    const date = (today.getDate() < 10) ? '0' + today.getDate() : today.getDate();
    return `${year}${month}${date}`;
}
export async function place() {
    const url = `${Base_URL}API_CNV_053/request?serviceKey=${API_KEY}&numOfRows=10&pageNo=1&targetDt=${getDateFormat()}`;
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