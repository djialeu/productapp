import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/api'; // Base URL of the Spring Boot app

const axiosInstance = axios.create({
  baseURL: API_BASE_URL,
});

export default axiosInstance;
