import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SharedService {
  url: string = 'http://localhost:8001/exchange-rates';
  constructor(private http: HttpClient) {}

  getExchangeRates(){
    return this.http.get(this.url);
  }
}
