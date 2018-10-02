import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CuspipeComponent } from './cuspipe.component';

describe('CuspipeComponent', () => {
  let component: CuspipeComponent;
  let fixture: ComponentFixture<CuspipeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CuspipeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CuspipeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
