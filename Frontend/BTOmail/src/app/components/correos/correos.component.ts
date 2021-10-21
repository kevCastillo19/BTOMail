import { Component, OnInit } from '@angular/core';
import { faEnvelope, faPaperPlane, faStar, faExclamationTriangle, faTrashAlt } from "@fortawesome/free-solid-svg-icons";

@Component({
  selector: 'app-correos',
  templateUrl: './correos.component.html',
  styleUrls: ['./correos.component.css']
})
export class CorreosComponent implements OnInit {

  faEnvelope = faEnvelope; 
  faPaperPlane = faPaperPlane; 
  faStar = faStar; 
  faExclamationTriangle = faExclamationTriangle; 
  faTrashAlt = faTrashAlt;

  constructor() { }

  ngOnInit(): void {
  }

}
