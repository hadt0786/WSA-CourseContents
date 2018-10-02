import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpqwComponent } from './httpqw.component';

describe('HttpqwComponent', () => {
  let component: HttpqwComponent;
  let fixture: ComponentFixture<HttpqwComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HttpqwComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HttpqwComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
