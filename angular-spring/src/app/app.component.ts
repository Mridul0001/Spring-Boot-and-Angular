import { Component } from '@angular/core';
import { SearchService } from './search.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  searchText = "";
  url = "";
  title = 'angular-spring';
  data: any;
  //parameters received from spring boot
      id = "-------";
      name = "-------";
      dep = "-------";
      des = "-------";
      loc = "-------";

  constructor(private search: SearchService){}
  onChange(event) {
    this.searchText = event.target.value;
  }

  searchClicked(event){
    event.preventDefault();
    this.url=`/search/${this.searchText}`;
    this.search.check(this.url).subscribe(data => {
        console.log(data);
        this.data = data;
        this.updateData();
    })
  }

  updateData() {
    this.id = this.data.id;
    this.name = this.data.name;
    this.dep = this.data.department;
    this.des = this.data.designation;
    this.loc = this.data.location;
  }
}
