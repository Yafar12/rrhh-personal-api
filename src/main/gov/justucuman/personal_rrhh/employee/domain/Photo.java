package gov.justucuman.personal_rrhh.employee.domain;

public record Photo(String value) {
        private static final String DEFAULT_PHOTO = "/assets/default-avatar.png";

        public Photo {
            if (value == null || value.isBlank()) {
                value = DEFAULT_PHOTO;
            }
        }

        public boolean isDefault() {
            return DEFAULT_PHOTO.equals(this.value);
        }
    }

