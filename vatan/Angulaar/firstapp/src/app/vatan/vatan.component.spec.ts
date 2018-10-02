import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VatanComponent } from './vatan.component';

describe('VatanComponent', () => {
  let component: VatanComponent;
  let fixture: ComponentFixture<VatanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VatanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VatanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
